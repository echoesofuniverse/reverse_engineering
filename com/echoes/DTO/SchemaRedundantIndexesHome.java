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
 * Home object for domain model class SchemaRedundantIndexes.
 * @see com.echoes.DTO.SchemaRedundantIndexes
 * @author Hibernate Tools
 */
public class SchemaRedundantIndexesHome {

	private static final Log log = LogFactory.getLog(SchemaRedundantIndexesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SchemaRedundantIndexes transientInstance) {
		log.debug("persisting SchemaRedundantIndexes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SchemaRedundantIndexes instance) {
		log.debug("attaching dirty SchemaRedundantIndexes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchemaRedundantIndexes instance) {
		log.debug("attaching clean SchemaRedundantIndexes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SchemaRedundantIndexes persistentInstance) {
		log.debug("deleting SchemaRedundantIndexes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchemaRedundantIndexes merge(SchemaRedundantIndexes detachedInstance) {
		log.debug("merging SchemaRedundantIndexes instance");
		try {
			SchemaRedundantIndexes result = (SchemaRedundantIndexes) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchemaRedundantIndexes findById(com.echoes.DTO.SchemaRedundantIndexesId id) {
		log.debug("getting SchemaRedundantIndexes instance with id: " + id);
		try {
			SchemaRedundantIndexes instance = (SchemaRedundantIndexes) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.SchemaRedundantIndexes", id);
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

	public List findByExample(SchemaRedundantIndexes instance) {
		log.debug("finding SchemaRedundantIndexes instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.SchemaRedundantIndexes")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
