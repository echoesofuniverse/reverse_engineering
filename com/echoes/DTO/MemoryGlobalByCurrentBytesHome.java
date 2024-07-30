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
 * Home object for domain model class MemoryGlobalByCurrentBytes.
 * @see com.echoes.DTO.MemoryGlobalByCurrentBytes
 * @author Hibernate Tools
 */
public class MemoryGlobalByCurrentBytesHome {

	private static final Log log = LogFactory.getLog(MemoryGlobalByCurrentBytesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(MemoryGlobalByCurrentBytes transientInstance) {
		log.debug("persisting MemoryGlobalByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MemoryGlobalByCurrentBytes instance) {
		log.debug("attaching dirty MemoryGlobalByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MemoryGlobalByCurrentBytes instance) {
		log.debug("attaching clean MemoryGlobalByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MemoryGlobalByCurrentBytes persistentInstance) {
		log.debug("deleting MemoryGlobalByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MemoryGlobalByCurrentBytes merge(MemoryGlobalByCurrentBytes detachedInstance) {
		log.debug("merging MemoryGlobalByCurrentBytes instance");
		try {
			MemoryGlobalByCurrentBytes result = (MemoryGlobalByCurrentBytes) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MemoryGlobalByCurrentBytes findById(com.echoes.DTO.MemoryGlobalByCurrentBytesId id) {
		log.debug("getting MemoryGlobalByCurrentBytes instance with id: " + id);
		try {
			MemoryGlobalByCurrentBytes instance = (MemoryGlobalByCurrentBytes) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.MemoryGlobalByCurrentBytes", id);
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

	public List findByExample(MemoryGlobalByCurrentBytes instance) {
		log.debug("finding MemoryGlobalByCurrentBytes instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.echoes.DTO.MemoryGlobalByCurrentBytes").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
