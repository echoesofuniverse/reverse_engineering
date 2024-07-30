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
 * Home object for domain model class LatestFileIo.
 * @see com.echoes.DTO.LatestFileIo
 * @author Hibernate Tools
 */
public class LatestFileIoHome {

	private static final Log log = LogFactory.getLog(LatestFileIoHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LatestFileIo transientInstance) {
		log.debug("persisting LatestFileIo instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LatestFileIo instance) {
		log.debug("attaching dirty LatestFileIo instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LatestFileIo instance) {
		log.debug("attaching clean LatestFileIo instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LatestFileIo persistentInstance) {
		log.debug("deleting LatestFileIo instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LatestFileIo merge(LatestFileIo detachedInstance) {
		log.debug("merging LatestFileIo instance");
		try {
			LatestFileIo result = (LatestFileIo) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LatestFileIo findById(com.echoes.DTO.LatestFileIoId id) {
		log.debug("getting LatestFileIo instance with id: " + id);
		try {
			LatestFileIo instance = (LatestFileIo) sessionFactory.getCurrentSession().get("com.echoes.DTO.LatestFileIo",
					id);
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

	public List findByExample(LatestFileIo instance) {
		log.debug("finding LatestFileIo instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.LatestFileIo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
