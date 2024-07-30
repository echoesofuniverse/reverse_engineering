package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.waitsGlobalByLatency;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class waitsGlobalByLatency.
 * @see com.echoes.DTO.X.waitsGlobalByLatency
 * @author Hibernate Tools
 */
public class waitsGlobalByLatencyHome {

    private static final Log log = LogFactory.getLog(X.waitsGlobalByLatencyHome.class);

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
    
    public void persist(waitsGlobalByLatency transientInstance) {
        log.debug("persisting waitsGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(waitsGlobalByLatency instance) {
        log.debug("attaching dirty waitsGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(waitsGlobalByLatency instance) {
        log.debug("attaching clean waitsGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(waitsGlobalByLatency persistentInstance) {
        log.debug("deleting waitsGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public waitsGlobalByLatency merge(waitsGlobalByLatency detachedInstance) {
        log.debug("merging waitsGlobalByLatency instance");
        try {
            waitsGlobalByLatency result = (waitsGlobalByLatency) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public waitsGlobalByLatency findById( com.echoes.DTO.X$waitsGlobalByLatencyId id) {
        log.debug("getting waitsGlobalByLatency instance with id: " + id);
        try {
            waitsGlobalByLatency instance = (waitsGlobalByLatency) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$waitsGlobalByLatency", id);
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
    
    public List findByExample(waitsGlobalByLatency instance) {
        log.debug("finding waitsGlobalByLatency instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$waitsGlobalByLatency")
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

