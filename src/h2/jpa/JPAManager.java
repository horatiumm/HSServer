package h2.jpa;


import h2.model.base.HObject;
import h2.model.base.ICreationDateLog;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAManager {

	private static final EntityManagerFactory emf;

	private static final ThreadLocal<EntityManager> threadLocal;

	private static final Logger logger;
    private static final String VARIABLE_NAME_PREFIX = "v";
    
	static {
		emf = Persistence.createEntityManagerFactory("HServerPU");
		threadLocal = new ThreadLocal<EntityManager>();
		logger = Logger.getLogger("HServerPU");
		logger.setLevel(Level.ALL);
	}

	public static EntityManager getEntityManager() {
		EntityManager manager = threadLocal.get();
		if (manager == null || !manager.isOpen()) {
			manager = emf.createEntityManager();
			threadLocal.set(manager);
		}
		return manager;
	}

	public static void closeEntityManager() {
		EntityManager em = threadLocal.get();
		threadLocal.set(null);
		if (em != null)
			em.close();
	}

	public static void beginTransaction() {
		getEntityManager().getTransaction().begin();
	}

	public static void commit() {
		getEntityManager().getTransaction().commit();
	}

	public static Query createQuery(String query) {		
		return getEntityManager().createQuery(query);
	}

	public static Query createNativeQuery(String query, Class resultClass) {
		if(resultClass!=null)
			return getEntityManager().createNativeQuery(query,resultClass);		
		return getEntityManager().createNativeQuery(query);
	}
	
	public static void log(String info, Level level, Throwable ex) {
		logger.log(level, info, ex);
	}

	public static Object save(Object transientInstance) {
		log("saving Post instance", Level.INFO, null);
		if(transientInstance instanceof ICreationDateLog) {
			((ICreationDateLog) transientInstance).setCreationDate(new Date (System.currentTimeMillis()));
		}
		
		try {
			beginTransaction();
			getEntityManager().persist(transientInstance);
			commit();
			log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			getEntityManager().getTransaction().rollback();
			log("save failed", Level.SEVERE, re);
			throw re;
		}
		return transientInstance;
	}

	public static void delete(Object persistentInstance) {
		log("deleting Post instance", Level.INFO, null);
		try {
			beginTransaction();
			getEntityManager().remove(persistentInstance);
			commit();
			log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			getEntityManager().getTransaction().rollback();			
			log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public static Object update(Object detachedInstance) {
		log("updating Post instance", Level.INFO, null);
		try {
			beginTransaction();
			Object result = getEntityManager().merge(detachedInstance);
			commit();
//			getEntityManager().flush();
			log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			getEntityManager().getTransaction().rollback();			
			log("update failed", Level.SEVERE, re);
			throw re;
		}
	}
	@SuppressWarnings("unchecked")
	public static Object findById(Class objClass, Integer id) {
		try {
			//return getEntityManager().find(objClass, id);
			return findByProperty(objClass.getName(),"id",id).get(0);
			
		} catch (RuntimeException re) {
			throw re;
		}
	}	
	
	@SuppressWarnings("unchecked")
	public static List<Object> findByProperty(String ObjName, String propertyName, final Object value) {
		try {
			final String queryString = "select model from "+ObjName+" model where model." + propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Object> findAllObjects(String objClass) {
		try {
			final String queryString = "select model from "+objClass+" model ";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			log("find allObjects failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/*
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static List<Object> getQueryResult(String queryString, Vector argValues, int maxresults) {
		Query query = getEntityManager().createQuery(queryString);
	    if (queryString != null) {
            if (argValues != null && argValues.size() > 0) {
                for (int i = 0; i < argValues.size(); i++) {
//                    if (argValues.get(i) instanceof Collection) {
                    query.setParameter(VARIABLE_NAME_PREFIX + i, argValues.get(i));
//                    }
                }
            }
	    }
        if (maxresults > 0)
            query.setMaxResults(maxresults);	    
	    return query.getResultList();
	    
	}
}
