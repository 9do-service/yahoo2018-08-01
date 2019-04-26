#!/usr/bin/python
# -*- coding: utf-8 -*-
import sys
import sqlite3

reload(sys)
sys.setdefaultencoding('utf-8')

conn = sqlite3.connect('yahoo20180801.db')
cursor = self.conn.cursor()
self.cursor.execute("SELECT * FROM ACTORS LIMIT 1;")
result = self.cursor.fetchall()
for item in sqlRlt:
	print "company_id: %s" %item[0]
	print "company_name: %s" %item[1].decode('utf8')
	print "userID: %s" %item[2]
	print "product_name: %s" %item[4].decode('utf8')
	print "unit_price: %d" %item[5]
	print "pay_type: %s" %item[8].decode('utf8')

conn.close()
