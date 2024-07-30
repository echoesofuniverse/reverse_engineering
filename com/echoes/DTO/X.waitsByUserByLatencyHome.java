package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.waitsByUserByLatency;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class waitsByUserByLatency.
 * @see com.echoes.DTO.X.waitsByUserByLatency
 * @author Hibernate Tools
 */
public class waitsByUserByLatencyHome {

    private static final Log log = LogFactory.getLog(X.waitsByUserByLatencyHome.class);

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
    
    public void persist(waitsByUserByLatency transientInstance) {
        log.debug("persisting waitsByUserByLatency instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(waitsByUserByLatency instance) {
        log.debug("attaching dirty waitsByUserByLatency instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(waitsByUserByLatency instance) {
        log.debug("attaching clean waitsByUserByLatency instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(waitsByUserByLatency persistentInstance) {
        log.debug("deleting waitsByUserByLatency instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public waitsByUserByLatency merge(waitsByUserByLatency detachedInstance) {
        log.debug("merging waitsByUserByLatency instance");
        try {
            waitsByUserByLatency result = (waitsByUserByLatency) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public waitsByUserByLatency findById( com.echoes.DTO.X$waitsByUserByLatencyId id) {
        log.debug("getting waitsByUserByLatency instance with id: " + id);
        try {
            waitsByUserByLatency instance = (waitsByUserByLatency) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$waitsByUserByLatency", id);
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
    
    public List findByExample(waitsByUserByLatency instance) {
        log.debug("finding waitsByUserByLatency instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$waitsByUserByLatency")
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

