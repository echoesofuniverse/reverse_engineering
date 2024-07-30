package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.ioGlobalByFileByBytes;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ioGlobalByFileByBytes.
 * @see com.echoes.DTO.X.ioGlobalByFileByBytes
 * @author Hibernate Tools
 */
public class ioGlobalByFileByBytesHome {

    private static final Log log = LogFactory.getLog(X.ioGlobalByFileByBytesHome.class);

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
    
    public void persist(ioGlobalByFileByBytes transientInstance) {
        log.debug("persisting ioGlobalByFileByBytes instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(ioGlobalByFileByBytes instance) {
        log.debug("attaching dirty ioGlobalByFileByBytes instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ioGlobalByFileByBytes instance) {
        log.debug("attaching clean ioGlobalByFileByBytes instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(ioGlobalByFileByBytes persistentInstance) {
        log.debug("deleting ioGlobalByFileByBytes instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ioGlobalByFileByBytes merge(ioGlobalByFileByBytes detachedInstance) {
        log.debug("merging ioGlobalByFileByBytes instance");
        try {
            ioGlobalByFileByBytes result = (ioGlobalByFileByBytes) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ioGlobalByFileByBytes findById( com.echoes.DTO.X$ioGlobalByFileByBytesId id) {
        log.debug("getting ioGlobalByFileByBytes instance with id: " + id);
        try {
            ioGlobalByFileByBytes instance = (ioGlobalByFileByBytes) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$ioGlobalByFileByBytes", id);
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
    
    public List findByExample(ioGlobalByFileByBytes instance) {
        log.debug("finding ioGlobalByFileByBytes instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$ioGlobalByFileByBytes")
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

