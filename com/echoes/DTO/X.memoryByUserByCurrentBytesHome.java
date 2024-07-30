package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.memoryByUserByCurrentBytes;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class memoryByUserByCurrentBytes.
 * @see com.echoes.DTO.X.memoryByUserByCurrentBytes
 * @author Hibernate Tools
 */
public class memoryByUserByCurrentBytesHome {

    private static final Log log = LogFactory.getLog(X.memoryByUserByCurrentBytesHome.class);

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
    
    public void persist(memoryByUserByCurrentBytes transientInstance) {
        log.debug("persisting memoryByUserByCurrentBytes instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(memoryByUserByCurrentBytes instance) {
        log.debug("attaching dirty memoryByUserByCurrentBytes instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(memoryByUserByCurrentBytes instance) {
        log.debug("attaching clean memoryByUserByCurrentBytes instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(memoryByUserByCurrentBytes persistentInstance) {
        log.debug("deleting memoryByUserByCurrentBytes instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public memoryByUserByCurrentBytes merge(memoryByUserByCurrentBytes detachedInstance) {
        log.debug("merging memoryByUserByCurrentBytes instance");
        try {
            memoryByUserByCurrentBytes result = (memoryByUserByCurrentBytes) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public memoryByUserByCurrentBytes findById( com.echoes.DTO.X$memoryByUserByCurrentBytesId id) {
        log.debug("getting memoryByUserByCurrentBytes instance with id: " + id);
        try {
            memoryByUserByCurrentBytes instance = (memoryByUserByCurrentBytes) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$memoryByUserByCurrentBytes", id);
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
    
    public List findByExample(memoryByUserByCurrentBytes instance) {
        log.debug("finding memoryByUserByCurrentBytes instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$memoryByUserByCurrentBytes")
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

