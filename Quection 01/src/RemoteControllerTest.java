
public class RemoteControllerTest {
            public static void main(String[] args) {
                RemoteController remoteController = new RemoteController(2);
                Light kitchenRoomLight = new KitchenRoomLight();
                Light livingRoomLight = new LivingRoomLight();

                Command kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
                Command kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
                Command kitchenRoomLightDim = new LightDimCommand(kitchenRoomLight, 50 );

                Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
                Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
                Command livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

                RemoteController.setCommand(0, kitchenRoomLightOn, kitchenRoomLightOff);
                RemoteController.setCommand(1, livingRoomLightOn, livingRoomLightOff);


                RemoteController.onButtonWasPressed(0);
                RemoteController.offButtonWasPressed(0);
                RemoteController.undoButtonWasPressed();



                RemoteController.onButtonWasPressed(1);
                RemoteController.offButtonWasPressed(1);
                RemoteController.undoButtonWasPressed();

                kitchenRoomLightDim.execute();
                kitchenRoomLightDim.undo();

                livingRoomLightDim.execute();
                livingRoomLightDim.undo();


            }
        }