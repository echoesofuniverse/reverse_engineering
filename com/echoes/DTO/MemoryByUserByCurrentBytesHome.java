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
 * Home object for domain model class MemoryByUserByCurrentBytes.
 * @see com.echoes.DTO.MemoryByUserByCurrentBytes
 * @author Hibernate Tools
 */
public class MemoryByUserByCurrentBytesHome {

	private static final Log log = LogFactory.getLog(MemoryByUserByCurrentBytesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(MemoryByUserByCurrentBytes transientInstance) {
		log.debug("persisting MemoryByUserByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MemoryByUserByCurrentBytes instance) {
		log.debug("attaching dirty MemoryByUserByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MemoryByUserByCurrentBytes instance) {
		log.debug("attaching clean MemoryByUserByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MemoryByUserByCurrentBytes persistentInstance) {
		log.debug("deleting MemoryByUserByCurrentBytes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MemoryByUserByCurrentBytes merge(MemoryByUserByCurrentBytes detachedInstance) {
		log.debug("merging MemoryByUserByCurrentBytes instance");
		try {
			MemoryByUserByCurrentBytes result = (MemoryByUserByCurrentBytes) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MemoryByUserByCurrentBytes findById(com.echoes.DTO.MemoryByUserByCurrentBytesId id) {
		log.debug("getting MemoryByUserByCurrentBytes instance with id: " + id);
		try {
			MemoryByUserByCurrentBytes instance = (MemoryByUserByCurrentBytes) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.MemoryByUserByCurrentBytes", id);
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

	public List findByExample(MemoryByUserByCurrentBytes instance) {
		log.debug("finding MemoryByUserByCurrentBytes instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.echoes.DTO.MemoryByUserByCurrentBytes").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
