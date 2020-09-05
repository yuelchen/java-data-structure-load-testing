# java-data-structure-load-testing
This project is to create a program for determining data structure performance against concurrent threads with a given load size.

---
### 🔍 Results (MS means milliseconds)
* Gives the time it took (in MS) for a given thread to complete. 
* Gives the time it took (in MS) for executor to complete and shutdown successfully. 

---
### 📑 Parameters
#### Load Count: 
* The number of iterations for a given operation (i.e. 10000 PUT operations into Map data structure). 
* The default number of iterations is 10000.
#### Thread Count: 
* The number of concurrent threads to be executed; each with the same given load size. 
* The default number of iterations is 5.

---
### 📏 Calculations
#### Cumulative number of operations against data structure: 
* (number of threads) x (size of load) = total put or get operations
#### Time converstion (nanoseconds to seconds)
* nanoseconds / 1000 = macroseconds
* macroseconds / 1000 = milliseconds
* milliseconds / 1000 = seconds

---
### ☎️ Data Structures 
* Hashtable
* HashMap
* TreeMap (with thread-safe parameter option)
* ConcurrentHashMap
* LinkedHashMap
