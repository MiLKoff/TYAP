lab0: 1.o 2.o
	gcc -o name 1.o 2.o
2.o: 2.c
	gcc -c 2.c
1.o: 1.c
	gcc -c 1.c
clean:
	rm *.o lab0
