import 'package:flutter/material.dart';

void main (){
  runApp(MyWidget());
}

class MyWidget extends StatelessWidget {
  const MyWidget({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Column(
          children: <Widget> [
            InkWell(
              child: Container(
                height: 100,
                width: 200,
                color: Colors.red,
              ),
            )
          ],
        ),
      ),
    );
  }
}