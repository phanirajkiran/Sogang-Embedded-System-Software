obj-m = kernel_timer.o 
CC := arm-none-linux-gnueabi-gcc

KDIR := /root/mylinux/kernel
PWD := $(shell pwd)

driver : 
	$(MAKE) -C $(KDIR) SUBDIRS=$(PWD) modules

clean : 
	rm -rf *.o
	rm -rf *.ko
	rm -rf *.mod.c
	rm -rf *.order
	rm -rf *.symvers
