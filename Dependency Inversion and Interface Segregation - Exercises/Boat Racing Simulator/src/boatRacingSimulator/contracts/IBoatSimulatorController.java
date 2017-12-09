package boatRacingSimulator.contracts;

import boatRacingSimulator.enumeration.EngineType;
import boatRacingSimulator.exeptions.*;

public interface IBoatSimulatorController {

    String CreateBoatEngine(String model, int horsepower, int displacement, EngineType engineType) throws DuplicateModelException;

    String CreateRowBoat(String model, int weight, int oars) throws DuplicateModelException;

    String CreateSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException;

    String CreatePowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel) throws NonExistantModelException, DuplicateModelException;

    String CreateYacht(String model, int weight, String engineModel, int cargoWeight) throws NonExistantModelException, DuplicateModelException;

    String OpenRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats) throws NoSetRaceException, RaceAlreadyExistsException;

    String SignUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException;

    String StartRace() throws InsufficientContestantsException, NoSetRaceException;

    String GetStatistic() throws NoSetRaceException;
}
