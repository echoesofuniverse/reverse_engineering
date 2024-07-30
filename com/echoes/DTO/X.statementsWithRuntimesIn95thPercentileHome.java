package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.statementsWithRuntimesIn95thPercentile;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class statementsWithRuntimesIn95thPercentile.
 * @see com.echoes.DTO.X.statementsWithRuntimesIn95thPercentile
 * @author Hibernate Tools
 */
public class statementsWithRuntimesIn95thPercentileHome {

    private static final Log log = LogFactory.getLog(X.statementsWithRuntimesIn95thPercentileHome.class);

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
    
    public void persist(statementsWithRuntimesIn95thPercentile transientInstance) {
        log.debug("persisting statementsWithRuntimesIn95thPercentile instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(statementsWithRuntimesIn95thPercentile instance) {
        log.debug("attaching dirty statementsWithRuntimesIn95thPercentile instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(statementsWithRuntimesIn95thPercentile instance) {
        log.debug("attaching clean statementsWithRuntimesIn95thPercentile instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(statementsWithRuntimesIn95thPercentile persistentInstance) {
        log.debug("deleting statementsWithRuntimesIn95thPercentile instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public statementsWithRuntimesIn95thPercentile merge(statementsWithRuntimesIn95thPercentile detachedInstance) {
        log.debug("merging statementsWithRuntimesIn95thPercentile instance");
        try {
            statementsWithRuntimesIn95thPercentile result = (statementsWithRuntimesIn95thPercentile) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public statementsWithRuntimesIn95thPercentile findById( com.echoes.DTO.X$statementsWithRuntimesIn95thPercentileId id) {
        log.debug("getting statementsWithRuntimesIn95thPercentile instance with id: " + id);
        try {
            statementsWithRuntimesIn95thPercentile instance = (statementsWithRuntimesIn95thPercentile) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$statementsWithRuntimesIn95thPercentile", id);
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
    
    public List findByExample(statementsWithRuntimesIn95thPercentile instance) {
        log.debug("finding statementsWithRuntimesIn95thPercentile instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$statementsWithRuntimesIn95thPercentile")
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

