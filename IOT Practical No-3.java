// Understanding and connectivity of Raspberry-Pi /Beagle board with camera. Write an application to capture and store the image.


import time
import picamera
import RPi.GPIO as GPIO

GPIO.setmode(GPIO.BOARD)
GPIO.setup(40,GPIO.OUT)
GPIO.setup(38,GPIO.OUT)

camera=picamera.PiCamera()
print("Camera is ON")
GPIO.output(40,GPIO.HIGH)
camera.capture('image.jpg')
time.sleep(1)
GPIO.output(40,GPIO.LOW)
print("Image Captured...")

camera.start_recording('video.h264')
GPIO.output(38.GPIO.HIGH)
time.sleep(3)
camera.stop_recording()
GPIO.output(38,GPIO.LOW)
print("Video Has Been Recorded...")
