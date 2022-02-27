


//1491. Average Salary Excluding the Minimum and Maximum Salary

class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int total = salary[0];
        for(int i=1; i< salary.length;i++){
            
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
            total += salary[i];
        }
        int totalPerson = salary.length - 2;
        
        return (double)(total - min - max)/totalPerson;
    }
}
