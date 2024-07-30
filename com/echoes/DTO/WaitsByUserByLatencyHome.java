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
 * Home object for domain model class WaitsByUserByLatency.
 * @see com.echoes.DTO.WaitsByUserByLatency
 * @author Hibernate Tools
 */
public class WaitsByUserByLatencyHome {

	private static final Log log = LogFactory.getLog(WaitsByUserByLatencyHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(WaitsByUserByLatency transientInstance) {
		log.debug("persisting WaitsByUserByLatency instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(WaitsByUserByLatency instance) {
		log.debug("attaching dirty WaitsByUserByLatency instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WaitsByUserByLatency instance) {
		log.debug("attaching clean WaitsByUserByLatency instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(WaitsByUserByLatency persistentInstance) {
		log.debug("deleting WaitsByUserByLatency instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WaitsByUserByLatency merge(WaitsByUserByLatency detachedInstance) {
		log.debug("merging WaitsByUserByLatency instance");
		try {
			WaitsByUserByLatency result = (WaitsByUserByLatency) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public WaitsByUserByLatency findById(com.echoes.DTO.WaitsByUserByLatencyId id) {
		log.debug("getting WaitsByUserByLatency instance with id: " + id);
		try {
			WaitsByUserByLatency instance = (WaitsByUserByLatency) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.WaitsByUserByLatency", id);
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

	public List findByExample(WaitsByUserByLatency instance) {
		log.debug("finding WaitsByUserByLatency instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.WaitsByUserByLatency")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
