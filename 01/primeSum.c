#include <stdio.h>

//�ж�n�Ƿ�������
int isPrime(int n) {
    int i;
    int flag = 1;
    for(i=2;i<n;i++) {
        if(n%i==0) {
            flag = 0;
            break;
        }
    }
    return flag;
}
//1-100  2-300, 511-988
void printOdd(int start,int end) {
}

int main() {
    //���1-100֮�������
    //1��ѭ��1-100
    int i;
    for(i=1;i<=100;i++) {
        //2�����ÿ�����Ƿ�������
        //����i�Ƿ�������
        if(i==1) {
            continue;
        }
        int j;
        int flag = 1;
        for(j=2;j<i;j++) {
            if(i%j==0) {
                flag = 0;
                break;
            }
        }
        if(flag) {
            printf("%d\n",i);
        }
    }

    int sum = 0;
    for(i=20;i<900;i++) {
        //�ж�i�Ƿ�������
        int j;
        int flag = 1;
        for(j=2;j<i;j++) {
            if(i%j==0) {
                flag = 0;
                break;
            }
        }
        if(flag) {
            sum+=i;
        }
    }
    printf("sum is:%d",sum);
}
