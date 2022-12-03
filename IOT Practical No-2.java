/* Understanding the connectivity of Raspberry-Pi /Beagle board circuit with temperature sensor. Write an application to read the environment temperature. If temperature crosses a
threshold value, generate alerts using LEDs */


import Adafruit_DHT
import RPi.GPIO as GPIO

GPIO.setmode(GPIO.BCM)
GPIO.setup(20,GPIO.OUT)
GPIO.setup(26,GPIO.OUT)
GPIO.setwarnings(False)

while True:
	Humid,Temp = Adafruit_DHT.read_retry(11,21)
	print(Humid,Temp)
	if(Humid>65):
		GPIO.output(26,GPIO.HIGH)
		if(Temp>28):
			GPIO.output(20,GPIO.HIGH)
		else:
			GPIO.output(20.GPIO.LOW)
	else:
		GPIO.output(26,GPIO.LOW)
		if(Temp>28):
			GPIO.output(20,GPIO.HIGH)
		else:
			GPIO.output(20.GPIO.LOW)
