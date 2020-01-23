package com.example.unix;

public class Test {

	public static void main(String[] args) {
		String json = "{\"size\": 10, \"results\":[ {\"row\":[ {\"key\":\"document_id\",\"value\":\"47507\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1953.1\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"23712\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT-COLLECTION\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"INDEPENDENT-AUDIT\"}, {\"key\":\"FIRST_NAME\",\"value\":\"TIS-FTFT\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_Collection\"}, {\"key\":\"INDEXER\",\"value\":\"HCK\"}, {\"key\":\"LAST_NAME\",\"value\":\"NKWPTMK\"}, {\"key\":\"NUM_PAGES\",\"value\":\"1\"}, {\"key\":\"REPORT_NUMBER\",\"value\":\"FINAL\"}, {\"key\":\"SCAN_DATE\",\"value\":\"3/19/2008 2:26:41 PM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"563912530\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"454530\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"HUNKY-DORY-INCORPORATED\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"47509\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1955.1\"}, {\"key\":\"DOC_GROUP\",\"value\":\"OTHER\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"WAIVER-LETTER\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Other_2\"}, {\"key\":\"INDEXER\",\"value\":\"HCK\"}, {\"key\":\"NUM_PAGES\",\"value\":\"2\"}, {\"key\":\"SCAN_DATE\",\"value\":\"3/19/2008 2:28:19 PM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"777502\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"MACCPRO-INCORPORATED\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48384\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"ADVERTISER\",\"value\":\"MASTERCARD\"}, {\"key\":\"APPEAL_DATE\",\"value\":\"1/1/2012 2:10:00 AM\"}, {\"key\":\"AR_COMMENTS\",\"value\":\"TESTING CMO 6-12\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Request Deletion\"}, {\"key\":\"AUDIT_END_DATE\",\"value\":\"1/1/2012 2:10:00 AM\"}, {\"key\":\"AUDIT_START_DATE\",\"value\":\"1/1/2011 2:10:00 AM\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1525.3\"}, {\"key\":\"CONTRACT_CODE\",\"value\":\"115\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"DESKTOP\"}, {\"key\":\"FIRST_NAME\",\"value\":\"YJIBHBE\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_2\"}, {\"key\":\"INDEXER\",\"value\":\"BIL\"}, {\"key\":\"INTENT_DATE\",\"value\":\"1/5/2012 2:10:00 AM\"}, {\"key\":\"LAST_NAME\",\"value\":\"CTNWE\"}, {\"key\":\"NUM_PAGES\",\"value\":\"76\"}, {\"key\":\"PRODUCT_NAME\",\"value\":\"MASTERCARD\"}, {\"key\":\"PRODUCTION_DATE\",\"value\":\"1/1/2011 2:10:00 AM\"}, {\"key\":\"REPORT_DATE\",\"value\":\"1/1/2011 2:10:00 AM\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:25:32 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"324047002\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"769857\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"MCCANN-ERICKSON\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48385\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1527.2\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"23568\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT-COLLECTION\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"ADVERTISING-AGENCY\"}, {\"key\":\"FIRST_NAME\",\"value\":\"QWMHW\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_Collection\"}, {\"key\":\"INDEXER\",\"value\":\"HCK\"}, {\"key\":\"LAST_NAME\",\"value\":\"KMJSWM\"}, {\"key\":\"NUM_PAGES\",\"value\":\"21\"}, {\"key\":\"REPORT_NUMBER\",\"value\":\"FINAL\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:35:14 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"395990610\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"800351\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"FOOTE-CONE-BELDING\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48386\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"AUDIT_END_DATE\",\"value\":\"5/5/2005 3:10:00 AM\"}, {\"key\":\"AUDIT_START_DATE\",\"value\":\"1/1/2002 2:10:00 AM\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1526.1\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"23705\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"LOAN-OUT\"}, {\"key\":\"FIRST_NAME\",\"value\":\"VOSN\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_3\"}, {\"key\":\"INDEXER\",\"value\":\"MAS\"}, {\"key\":\"LAST_NAME\",\"value\":\"GCBFFBGN\"}, {\"key\":\"NUM_PAGES\",\"value\":\"16\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:32:07 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"644872533\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48387\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_COMMENTS\",\"value\":\"update intent date to 01/01/2012\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Update Data\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1524.2\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"20191\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"AUTHENTICITY\"}, {\"key\":\"FIRST_NAME\",\"value\":\"KJHS\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_1\"}, {\"key\":\"INDEXER\",\"value\":\"MAS\"}, {\"key\":\"INTENT_DATE\",\"value\":\"6/10/2003 3:10:00 AM\"}, {\"key\":\"LAST_NAME\",\"value\":\"CTNNBHB\"}, {\"key\":\"NUM_PAGES\",\"value\":\"29\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:22:06 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"032808335\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"787466\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"DISTRON-VIDEO-CORP\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48388\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1527.12\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"14372\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT-COLLECTION\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"MAJOR-AUDIT\"}, {\"key\":\"FIRST_NAME\",\"value\":\"NTITHKCT\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_Collection\"}, {\"key\":\"INDEXER\",\"value\":\"HCK\"}, {\"key\":\"LAST_NAME\",\"value\":\"ITKCBN\"}, {\"key\":\"NUM_PAGES\",\"value\":\"10\"}, {\"key\":\"REPORT_NUMBER\",\"value\":\"FINAL\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:35:14 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"046895726\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"922792\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"UNIVERSAL-STUDIOS\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48391\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_COMMENTS\",\"value\":\"CMO TESTING\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1527.6\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"21603\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT-COLLECTION\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"DIRECT-REQUEST\"}, {\"key\":\"FIRST_NAME\",\"value\":\"WMBX\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_Collection\"}, {\"key\":\"INDEXER\",\"value\":\"HCK\"}, {\"key\":\"LAST_NAME\",\"value\":\"IXXJMITXE\"}, {\"key\":\"NUM_PAGES\",\"value\":\"20\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:35:14 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"091826230\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"658008\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"NBC-UNIVERSAL\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48393\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1527.9\"}, {\"key\":\"COLLECTION_FILE_NUMBER\",\"value\":\"26315\"}, {\"key\":\"DOC_GROUP\",\"value\":\"AUDIT-COLLECTION\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"LOAN-OUT\"}, {\"key\":\"FIRST_NAME\",\"value\":\"JNPTFK\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Audit_Collection\"}, {\"key\":\"INDEXER\",\"value\":\"HCK\"}, {\"key\":\"LAST_NAME\",\"value\":\"GTKKJH\"}, {\"key\":\"NUM_PAGES\",\"value\":\"12\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 8:35:14 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"SSN\",\"value\":\"123456584\"}, {\"key\":\"STUDIO_CODE\",\"value\":\"775703\"}, {\"key\":\"STUDIO_NAME\",\"value\":\"AVERY-PIX\"} ]},{\"row\":[ {\"key\":\"document_id\",\"value\":\"48455\"}, {\"key\":\"template\",\"value\":\"CCDoc\"}, {\"key\":\"AR_DOC_STATUS\",\"value\":\"Active\"}, {\"key\":\"BATCH_NUMBER\",\"value\":\"1545.9\"}, {\"key\":\"DOC_GROUP\",\"value\":\"REPORT\"}, {\"key\":\"DOC_SOURCE\",\"value\":\"Scan-Barcode\"}, {\"key\":\"DOC_TYPE\",\"value\":\"NKSF-STATUS\"}, {\"key\":\"IMAGE_DOC_TYPE\",\"value\":\"CCD_Report_1\"}, {\"key\":\"INDEXER\",\"value\":\"MAS\"}, {\"key\":\"NUM_PAGES\",\"value\":\"43\"}, {\"key\":\"SCAN_DATE\",\"value\":\"5/29/2007 9:21:37 AM\"}, {\"key\":\"SCAN_MACHINE\",\"value\":\"389\"}, {\"key\":\"SCAN_USER\",\"value\":\"SAGPH\\\\hcb\"}, {\"key\":\"STAT_MONTH\",\"value\":\"FEBRUARY\"}, {\"key\":\"STAT_YEAR\",\"value\":\"2005\"} ]}]}";
		

				String a = json.replaceAll("(\\r|\\n|\\r\\n|\\t)+", " ");
		System.out.println(a);
	}

}