<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>NVP1_Login Account</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>3acf8bc6-ad6f-43ad-ad34-fcc13c98c67c</testSuiteGuid>
   <testCaseLink>
      <guid>4accd469-2846-4c2f-ba24-e7429a8551cd</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01_openBrowser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>70e2f3fc-9835-4178-be8b-f602f674d6d9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC02_Login_ErrorAccount</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>cb6e3916-7917-4044-b399-96e1774df3f8</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>1-7</value>
         </iterationEntity>
         <testDataId>Data Files/login_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>cb6e3916-7917-4044-b399-96e1774df3f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>inputEmail</value>
         <variableId>a475d96b-997a-49d9-abd6-d76aaa06a840</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>cb6e3916-7917-4044-b399-96e1774df3f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>inputPass</value>
         <variableId>0bf3f98d-2e75-4d7f-b193-3a341d8f4908</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>cb6e3916-7917-4044-b399-96e1774df3f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedMsg</value>
         <variableId>0fa88e67-745a-41d5-8194-f07358f57a86</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5c40f66f-5d9a-4f83-b09b-52ba9d3d0ba5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC03_Login_RoleAccount</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
