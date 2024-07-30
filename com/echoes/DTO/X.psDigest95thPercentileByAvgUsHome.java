package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.psDigest95thPercentileByAvgUs;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class psDigest95thPercentileByAvgUs.
 * @see com.echoes.DTO.X.psDigest95thPercentileByAvgUs
 * @author Hibernate Tools
 */
public class psDigest95thPercentileByAvgUsHome {

    private static final Log log = LogFactory.getLog(X.psDigest95thPercentileByAvgUsHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(psDigest95thPercentileByAvgUs transientInstance) {
        log.debug("persisting psDigest95thPercentileByAvgUs instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(psDigest95thPercentileByAvgUs instance) {
        log.debug("attaching dirty psDigest95thPercentileByAvgUs instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(psDigest95thPercentileByAvgUs instance) {
        log.debug("attaching clean psDigest95thPercentileByAvgUs instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(psDigest95thPercentileByAvgUs persistentInstance) {
        log.debug("deleting psDigest95thPercentileByAvgUs instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public psDigest95thPercentileByAvgUs merge(psDigest95thPercentileByAvgUs detachedInstance) {
        log.debug("merging psDigest95thPercentileByAvgUs instance");
        try {
            psDigest95thPercentileByAvgUs result = (psDigest95thPercentileByAvgUs) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public psDigest95thPercentileByAvgUs findById( com.echoes.DTO.X$psDigest95thPercentileByAvgUsId id) {
        log.debug("getting psDigest95thPercentileByAvgUs instance with id: " + id);
        try {
            psDigest95thPercentileByAvgUs instance = (psDigest95thPercentileByAvgUs) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$psDigest95thPercentileByAvgUs", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(psDigest95thPercentileByAvgUs instance) {
        log.debug("finding psDigest95thPercentileByAvgUs instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$psDigest95thPercentileByAvgUs")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

