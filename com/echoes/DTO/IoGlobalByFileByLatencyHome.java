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
 * Home object for domain model class IoGlobalByFileByLatency.
 * @see com.echoes.DTO.IoGlobalByFileByLatency
 * @author Hibernate Tools
 */
public class IoGlobalByFileByLatencyHome {

	private static final Log log = LogFactory.getLog(IoGlobalByFileByLatencyHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(IoGlobalByFileByLatency transientInstance) {
		log.debug("persisting IoGlobalByFileByLatency instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(IoGlobalByFileByLatency instance) {
		log.debug("attaching dirty IoGlobalByFileByLatency instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IoGlobalByFileByLatency instance) {
		log.debug("attaching clean IoGlobalByFileByLatency instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(IoGlobalByFileByLatency persistentInstance) {
		log.debug("deleting IoGlobalByFileByLatency instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IoGlobalByFileByLatency merge(IoGlobalByFileByLatency detachedInstance) {
		log.debug("merging IoGlobalByFileByLatency instance");
		try {
			IoGlobalByFileByLatency result = (IoGlobalByFileByLatency) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IoGlobalByFileByLatency findById(com.echoes.DTO.IoGlobalByFileByLatencyId id) {
		log.debug("getting IoGlobalByFileByLatency instance with id: " + id);
		try {
			IoGlobalByFileByLatency instance = (IoGlobalByFileByLatency) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.IoGlobalByFileByLatency", id);
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

	public List findByExample(IoGlobalByFileByLatency instance) {
		log.debug("finding IoGlobalByFileByLatency instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.IoGlobalByFileByLatency")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
