<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>PolicyCreation</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>f551b702-f1ed-40fa-84a5-8717ff38521f</testSuiteGuid>
   <testCaseLink>
      <guid>6eeed2d0-06da-438c-9830-a8f537485b49</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01-LoginApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>70967b2b-8d14-44f9-8a10-cc470d748f56</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC02-CreatePolicy</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f7464fb7-5c35-46bb-b277-bad18dfa810c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>4a160e9f-3ddb-45ec-a34a-1c92399ce4cb</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0253e48c-f230-4cff-9c28-a24f14a9595d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC05-PaymentSection</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f4264306-0415-4c48-8a86-98dfb823e079</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>f4264306-0415-4c48-8a86-98dfb823e079</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>40ee224d-c9c5-4749-8e50-9a6add50ee67</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0088042c-7947-44e7-831b-81bf430a76af</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/TC04-AccountMatching-MGA</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0d9e267d-9679-41d8-ae0c-7cd278681f2b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/MTA_PolicyNO</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>0d9e267d-9679-41d8-ae0c-7cd278681f2b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PolicyNo</value>
         <variableId>7aa213af-01dc-4774-96b7-8e9d7c39244b</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
