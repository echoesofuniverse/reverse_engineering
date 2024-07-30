package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.userSummaryByStatementLatency;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class userSummaryByStatementLatency.
 * @see com.echoes.DTO.X.userSummaryByStatementLatency
 * @author Hibernate Tools
 */
public class userSummaryByStatementLatencyHome {

    private static final Log log = LogFactory.getLog(X.userSummaryByStatementLatencyHome.class);

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
    
    public void persist(userSummaryByStatementLatency transientInstance) {
        log.debug("persisting userSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(userSummaryByStatementLatency instance) {
        log.debug("attaching dirty userSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(userSummaryByStatementLatency instance) {
        log.debug("attaching clean userSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(userSummaryByStatementLatency persistentInstance) {
        log.debug("deleting userSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public userSummaryByStatementLatency merge(userSummaryByStatementLatency detachedInstance) {
        log.debug("merging userSummaryByStatementLatency instance");
        try {
            userSummaryByStatementLatency result = (userSummaryByStatementLatency) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public userSummaryByStatementLatency findById( com.echoes.DTO.X$userSummaryByStatementLatencyId id) {
        log.debug("getting userSummaryByStatementLatency instance with id: " + id);
        try {
            userSummaryByStatementLatency instance = (userSummaryByStatementLatency) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$userSummaryByStatementLatency", id);
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
    
    public List findByExample(userSummaryByStatementLatency instance) {
        log.debug("finding userSummaryByStatementLatency instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$userSummaryByStatementLatency")
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

