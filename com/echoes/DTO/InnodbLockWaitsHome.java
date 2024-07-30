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
 * Home object for domain model class InnodbLockWaits.
 * @see com.echoes.DTO.InnodbLockWaits
 * @author Hibernate Tools
 */
public class InnodbLockWaitsHome {

	private static final Log log = LogFactory.getLog(InnodbLockWaitsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(InnodbLockWaits transientInstance) {
		log.debug("persisting InnodbLockWaits instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(InnodbLockWaits instance) {
		log.debug("attaching dirty InnodbLockWaits instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(InnodbLockWaits instance) {
		log.debug("attaching clean InnodbLockWaits instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(InnodbLockWaits persistentInstance) {
		log.debug("deleting InnodbLockWaits instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public InnodbLockWaits merge(InnodbLockWaits detachedInstance) {
		log.debug("merging InnodbLockWaits instance");
		try {
			InnodbLockWaits result = (InnodbLockWaits) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InnodbLockWaits findById(com.echoes.DTO.InnodbLockWaitsId id) {
		log.debug("getting InnodbLockWaits instance with id: " + id);
		try {
			InnodbLockWaits instance = (InnodbLockWaits) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.InnodbLockWaits", id);
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

	public List findByExample(InnodbLockWaits instance) {
		log.debug("finding InnodbLockWaits instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.InnodbLockWaits")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
