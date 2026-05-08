import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: AccelerometerPage(),
    );
  }
}

class AccelerometerPage extends StatefulWidget {
  const AccelerometerPage({super.key});

  @override
  State<AccelerometerPage> createState() => _AccelerometerPageState();
}

class _AccelerometerPageState extends State<AccelerometerPage> {

  double x = 0;
  double y = 0;
  double z = 0;

  void moverMouse(PointerEvent evento) {

    setState(() {

      x = evento.position.dx;
      y = evento.position.dy;

      z = (x + y) / 2;

    });
  }

  @override
  Widget build(BuildContext context) {

    return Scaffold(

      appBar: AppBar(
        title: const Text("Acelerômetro"),
      ),

      body: Listener(

        onPointerMove: moverMouse,

        child: Center(

          child: Column(

            mainAxisAlignment: MainAxisAlignment.center,

            children: [

              Text(
                "X: ${x.toStringAsFixed(2)}",
                style: const TextStyle(fontSize: 25),
              ),

              Text(
                "Y: ${y.toStringAsFixed(2)}",
                style: const TextStyle(fontSize: 25),
              ),

              Text(
                "Z: ${z.toStringAsFixed(2)}",
                style: const TextStyle(fontSize: 25),
              ),

            ],
          ),
        ),
      ),
    );
  }
}
