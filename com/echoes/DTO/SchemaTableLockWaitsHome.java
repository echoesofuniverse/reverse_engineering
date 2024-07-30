package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class SchemaTableLockWaits.
 * @see com.echoes.DTO.SchemaTableLockWaits
 * @author Hibernate Tools
 */
public class SchemaTableLockWaitsHome {

	private static final Log log = LogFactory.getLog(SchemaTableLockWaitsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SchemaTableLockWaits transientInstance) {
		log.debug("persisting SchemaTableLockWaits instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SchemaTableLockWaits instance) {
		log.debug("attaching dirty SchemaTableLockWaits instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchemaTableLockWaits instance) {
		log.debug("attaching clean SchemaTableLockWaits instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SchemaTableLockWaits persistentInstance) {
		log.debug("deleting SchemaTableLockWaits instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchemaTableLockWaits merge(SchemaTableLockWaits detachedInstance) {
		log.debug("merging SchemaTableLockWaits instance");
		try {
			SchemaTableLockWaits result = (SchemaTableLockWaits) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchemaTableLockWaits findById(com.echoes.DTO.SchemaTableLockWaitsId id) {
		log.debug("getting SchemaTableLockWaits instance with id: " + id);
		try {
			SchemaTableLockWaits instance = (SchemaTableLockWaits) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.SchemaTableLockWaits", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SchemaTableLockWaits instance) {
		log.debug("finding SchemaTableLockWaits instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.SchemaTableLockWaits")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
