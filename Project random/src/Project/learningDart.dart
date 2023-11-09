const phi = 3.14;
const g = 10;
void main(){
  var rad = 7;
  var mass = 89;
  var height = 100;
  var name = 'doctor';
  num heighter = 1.90;
  var age = 80;
  var result = clone (age, heighter);
  var radius = radiusan (rad);
  var gravitation = grav (mass, height);
    print ('total radius $radius cm');
    print ('total gravitation is $gravitation m/g');
    print ('hi, $name your live idependency is $result because your age is $age');
}
num radiusan (num rad){
    num radian = phi * rad *rad;
  return radian;
}
num grav (num mass, num height){
  num gravitation =  mass * g * height;
  return gravitation;
}
num clone (int age, num heighter){
  num rest = 0.0;
  if (age >= 80){
    var sum = heighter - 100;
    rest = sum;
  }
  else if (age <= 80){
    var sum = heighter / 100;
    rest = sum;
  }
  return rest;
}