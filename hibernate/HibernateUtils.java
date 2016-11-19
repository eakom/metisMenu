package com.eakom.controller;

import org.hibernate.Session;//hibernate3��  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  
  
public class HibernateUtils {  
   private static SessionFactory factory;  
      
   static{  
           try{  
            //��ȡhibernate.cfg.xml�ļ�  
            Configuration cfg=new Configuration().configure();  
               
            //����SessionFactory  
            factory=cfg.buildSessionFactory();  
     
           }catch(Exception e){  
              e.printStackTrace();   
           }  
   }    
     
      //��ÿ����ŵ�Session  
   public static Session getSession(){  
       return factory.openSession();  
   }  
     
      //�ر�Session  
   public static void closeSession(Session session){  
       if(session!=null){  
           if(session.isOpen()){  
               session.close();  
           }  
       }  
   }  
     
   public static SessionFactory getSessionFactory(){  
       return factory;  
   }  
}  
