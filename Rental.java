class Rental{


final static int MINUTESINHOUR = 60;
final static int HOURLYRATE = 40;

private String contractNumber;
private int hoursRented;
private int extraMinutes;
private int totalPrice;

public void setcNum(String cNum){
  contractNumber = cNum;
}

public void setHoursAndMinutes(int time) {
  hoursRented = time/MINUTESINHOUR;
  extraMinutes = time % MINUTESINHOUR;
  totalPrice = (hoursRented * HOURLYRATE) + extraMinutes;
}

public String getContractNum() {
  return contractNumber;
}

public int getExtraMin() {
  return extraMinutes;
}

public int getTotalPrice() {
  return totalPrice;
}

public int getHoursRented() {
  return hoursRented;
}

}