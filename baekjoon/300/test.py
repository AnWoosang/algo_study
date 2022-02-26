import time 

start_time = time.process_time()

for i in range(2000000000):
    a = 0
end_time = time.process_time()

print(end_time - start_time)