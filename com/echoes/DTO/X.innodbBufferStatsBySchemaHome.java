package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.innodbBufferStatsBySchema;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class innodbBufferStatsBySchema.
 * @see com.echoes.DTO.X.innodbBufferStatsBySchema
 * @author Hibernate Tools
 */
public class innodbBufferStatsBySchemaHome {

    private static final Log log = LogFactory.getLog(X.innodbBufferStatsBySchemaHome.class);

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
    
    public void persist(innodbBufferStatsBySchema transientInstance) {
        log.debug("persisting innodbBufferStatsBySchema instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(innodbBufferStatsBySchema instance) {
        log.debug("attaching dirty innodbBufferStatsBySchema instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(innodbBufferStatsBySchema instance) {
        log.debug("attaching clean innodbBufferStatsBySchema instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(innodbBufferStatsBySchema persistentInstance) {
        log.debug("deleting innodbBufferStatsBySchema instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public innodbBufferStatsBySchema merge(innodbBufferStatsBySchema detachedInstance) {
        log.debug("merging innodbBufferStatsBySchema instance");
        try {
            innodbBufferStatsBySchema result = (innodbBufferStatsBySchema) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public innodbBufferStatsBySchema findById( com.echoes.DTO.X$innodbBufferStatsBySchemaId id) {
        log.debug("getting innodbBufferStatsBySchema instance with id: " + id);
        try {
            innodbBufferStatsBySchema instance = (innodbBufferStatsBySchema) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$innodbBufferStatsBySchema", id);
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
    
    public List findByExample(innodbBufferStatsBySchema instance) {
        log.debug("finding innodbBufferStatsBySchema instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$innodbBufferStatsBySchema")
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

