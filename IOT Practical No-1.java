// Understanding the connectivity of Raspberry-Pi / Adriano with IR sensor. Write an application to detect obstacle and notify user using LEDs.

import time
import RPi.GPIO as GPIO

GPIO.setmode(GPIO.BOARD)
GPIO.setup(36,GPIO.IN)
GPIO.setup(40,GPIO.OUT)
GPIO.setup(37,GPIO.OUT)
GPIO.setwarnings(False)

while True:
	n=GPIO.input(36)
	if(n==0):
		print("OBJECT DETECTED...")
		GPIO.output(40,GPIO.HIGH)
		GPIO.output(37,GPIO.LOW)
		time.sleep(0.5)
	elif(n==1):
		print("OBJECT NOT DETECTED...")
		time.sleep(0.5)
		GPIO.output(40,GPIO.LOW)
		GPIO.output(37,GPIO.HIGH)
