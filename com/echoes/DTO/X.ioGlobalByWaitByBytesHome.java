package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.ioGlobalByWaitByBytes;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ioGlobalByWaitByBytes.
 * @see com.echoes.DTO.X.ioGlobalByWaitByBytes
 * @author Hibernate Tools
 */
public class ioGlobalByWaitByBytesHome {

    private static final Log log = LogFactory.getLog(X.ioGlobalByWaitByBytesHome.class);

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
    
    public void persist(ioGlobalByWaitByBytes transientInstance) {
        log.debug("persisting ioGlobalByWaitByBytes instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(ioGlobalByWaitByBytes instance) {
        log.debug("attaching dirty ioGlobalByWaitByBytes instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ioGlobalByWaitByBytes instance) {
        log.debug("attaching clean ioGlobalByWaitByBytes instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(ioGlobalByWaitByBytes persistentInstance) {
        log.debug("deleting ioGlobalByWaitByBytes instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ioGlobalByWaitByBytes merge(ioGlobalByWaitByBytes detachedInstance) {
        log.debug("merging ioGlobalByWaitByBytes instance");
        try {
            ioGlobalByWaitByBytes result = (ioGlobalByWaitByBytes) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ioGlobalByWaitByBytes findById( com.echoes.DTO.X$ioGlobalByWaitByBytesId id) {
        log.debug("getting ioGlobalByWaitByBytes instance with id: " + id);
        try {
            ioGlobalByWaitByBytes instance = (ioGlobalByWaitByBytes) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$ioGlobalByWaitByBytes", id);
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
    
    public List findByExample(ioGlobalByWaitByBytes instance) {
        log.debug("finding ioGlobalByWaitByBytes instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$ioGlobalByWaitByBytes")
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

