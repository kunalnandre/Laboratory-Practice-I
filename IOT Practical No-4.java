// Create a small dashboard application to be deployed on cloud. Different publisher devices can publish their information and interested application can subscribe.


import datetime
from datetime import datetime
import RPi.GPIO as GPIO
import time
import decimal
import http.client as httplib, urllib
from urllib.request import urlopen
import time
import subprocess
import sys
import Adafruit_DHT
import json
sleep = 2 # how many seconds to sleep between posts to the
channel
key = 'HJEQMRUDGXPTXNPY' # Thingspeak channel to update
while True:
time.sleep(5)
humidity, temperature = Adafruit_DHT.read_retry(11,21)
print (temperature, humidity)
params =
urllib.parse.urlencode({'field1':temperature,'field2':humidi
ty,'key':key})
headers = {"Content-typZZe": "application/x-www-formurlencoded","Accept": "text/plain"}
conn = httplib.HTTPConnection("api.thingspeak.com:80")
try:
conn.request("POST", "/update", params, headers)
response = conn.getresponse()
print (response.status, response.reason)
data = response.read()
conn.close()
except:
print ("connection failed")
