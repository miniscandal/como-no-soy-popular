import psutil
import time

while True:
    # Get CPU usage
    cpu_usage = psutil.cpu_percent()
    print(f"Uso de CPU: {cpu_usage}%")

    # Get memory usage
    memory_usage = psutil.virtual_memory().percent
    print(f"Uso de Memoria: {memory_usage}%")

    time.sleep(1)
