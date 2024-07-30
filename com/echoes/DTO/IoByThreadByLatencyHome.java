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
 * Home object for domain model class IoByThreadByLatency.
 * @see com.echoes.DTO.IoByThreadByLatency
 * @author Hibernate Tools
 */
public class IoByThreadByLatencyHome {

	private static final Log log = LogFactory.getLog(IoByThreadByLatencyHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(IoByThreadByLatency transientInstance) {
		log.debug("persisting IoByThreadByLatency instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(IoByThreadByLatency instance) {
		log.debug("attaching dirty IoByThreadByLatency instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IoByThreadByLatency instance) {
		log.debug("attaching clean IoByThreadByLatency instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(IoByThreadByLatency persistentInstance) {
		log.debug("deleting IoByThreadByLatency instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IoByThreadByLatency merge(IoByThreadByLatency detachedInstance) {
		log.debug("merging IoByThreadByLatency instance");
		try {
			IoByThreadByLatency result = (IoByThreadByLatency) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IoByThreadByLatency findById(com.echoes.DTO.IoByThreadByLatencyId id) {
		log.debug("getting IoByThreadByLatency instance with id: " + id);
		try {
			IoByThreadByLatency instance = (IoByThreadByLatency) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.IoByThreadByLatency", id);
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

	public List findByExample(IoByThreadByLatency instance) {
		log.debug("finding IoByThreadByLatency instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.IoByThreadByLatency")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
