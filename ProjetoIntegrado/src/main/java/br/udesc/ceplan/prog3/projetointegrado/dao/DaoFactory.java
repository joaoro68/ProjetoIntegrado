/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceplan.prog3.projetointegrado.dao;

import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Richard
 */
public abstract class DaoFactory {
    
    private static DaoFactory instance;
    
    private static final Logger logger = LoggerFactory.getLogger(DaoFactory.class);
    
    protected DaoFactory() {
        
    }
    
    public static DaoFactory getFactory() throws SQLException, ClassNotFoundException {
        if (DaoFactory.instance == null) {
            Configuration config = Configuration.getInstance();
            int dataBaseType = config.getDatabaseType();
            if (dataBaseType == DatabaseType.DATABASE_HSQLDB) {
                DaoFactory.instance = new HsqldbDaoFactory("jdbc:hsqldb:mem:aname", "sa", "");
            } else if (dataBaseType == DatabaseType.DATABASE_MYSQL) {
                StringBuilder sb = new StringBuilder("jdbc:mysql://");
                sb.append(config.getDbHostname()).append("/");
                sb.append("exer07");
                sb.append("?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
                logger.debug(sb.toString());
                DaoFactory.instance = new MysqlDaoFactory(sb.toString(), "root", "root");
            } else {
                DaoFactory.instance = null;
            }
            
        }
        return DaoFactory.instance;
    }
    
    public abstract void startTransaction() throws SQLException;
    public abstract void commitTransaction() throws SQLException;
    public abstract void rollbackTransaction() throws SQLException;
    
    public abstract ClienteDao getClienteDao();
    public abstract PedidoDao getPedidoDao();
}
