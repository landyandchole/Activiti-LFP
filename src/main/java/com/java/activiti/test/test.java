package com.java.activiti.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

public class test {
    /**�������棨���Ķ��󣩣�Ĭ�ϼ�����·��������Ϊactiviti.cfg.xml*/  
    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();  
      
    //�������̶���  
    @Test  
    public void deployementProcessDefinition(){  
        Deployment deployment = processEngine.getRepositoryService()//��ȡ���̶���Ͳ��������ص�Service  
                        .createDeployment()//�����������  
                        .name("helloworld��ʾ")//�������̵�����  
//                        /Activiti-LFP/src/main/resources/activiti/activitiEmployeeProcess.bpmn
                        .addClasspathResource("resources/activiti/activitiEmployeeProcess.bpmn")//������Դ�ļ���һ��ֻ�ܼ���һ���ļ�  
                        .addClasspathResource("resources/activiti/activitiEmployeeProcess.png")//  
                        .deploy();//��ɲ���  
        System.out.println("����ID��"+deployment.getId());//1  
        System.out.println("����ʱ�䣺"+deployment.getDeploymentTime());  
    }  
	  
}
