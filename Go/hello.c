#include<stdio.h>
#define MAX 10
int main(void) {
	int a[MAX];
	for(int i = 0; i < MAX; i++){
		a[i] = i + 1;
	}
	for(int i = 0; i < MAX; i++){
		printf("%d ", a[i]);
	}
	printf("\n");
	return 0; 
}
