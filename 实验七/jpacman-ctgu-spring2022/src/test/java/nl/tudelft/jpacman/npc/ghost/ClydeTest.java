package nl.tudelft.jpacman.npc.ghost;
import io.cucumber.java.nl.Stel;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.level.*;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.jupiter.api.*;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ClydeTest {
    @Test
    @DisplayName("Clybe离Player距离小于8个方块")
    @Order(1)
    public void departLessThanEight1(){
        PacManSprites sprites =new PacManSprites();
        LevelFactory levelFactory =new LevelFactory(
            sprites,
            new GhostFactory(sprites),
            mock(PointCalculator.class));
        BoardFactory boardFactory = new BoardFactory(sprites);
        GhostFactory ghostFactor = new GhostFactory(sprites);
        MapParser mapParser = new GhostMapParser(levelFactory, boardFactory, ghostFactor);
        List<String> text = Lists.newArrayList(
            "##############",
            "#.#....C.....P",
            "##############"
        );
        Level level = mapParser.parseMap(text);
        Clyde clyde = Navigation.findUnitInBoard(Clyde.class,level.getBoard());
        Player player = new PlayerFactory(new PacManSprites()).createPacMan();
        player.setDirection(Direction.WEST);
        level.registerPlayer(player);
        Optional<Direction> opt = clyde.nextAiMove();
        assertThat(opt.get()).isEqualTo(Direction.valueOf("WEST"));
    }

    @Test
    @DisplayName("Clybe离Player距离小于8个方块")
    @Order(2)
    public void departLessThanEight2(){
        PacManSprites sprites =new PacManSprites();
        LevelFactory levelFactory =new LevelFactory(
            sprites,
            new GhostFactory(sprites),
            mock(PointCalculator.class));
        BoardFactory boardFactory = new BoardFactory(sprites);
        GhostFactory ghostFactor = new GhostFactory(sprites);
        MapParser mapParser = new GhostMapParser(levelFactory, boardFactory, ghostFactor);
        List<String> text = Lists.newArrayList(
            "#########.....",
            "#.#..........C",
            "#############P"
        );
        Level level = mapParser.parseMap(text);
        Clyde clyde = Navigation.findUnitInBoard(Clyde.class,level.getBoard());
        Player player = new PlayerFactory(new PacManSprites()).createPacMan();
        player.setDirection(Direction.WEST);
        level.registerPlayer(player);
        Optional<Direction> opt = clyde.nextAiMove();
        assertThat(opt.get()).isEqualTo(Direction.valueOf("NORTH"));
    }

    @Test
    @DisplayName("Clybe离Player距离小于8个方块")
    @Order(3)
    public void departLessThanEight3(){
        PacManSprites sprites =new PacManSprites();
        LevelFactory levelFactory =new LevelFactory(
            sprites,
            new GhostFactory(sprites),
            mock(PointCalculator.class));
        BoardFactory boardFactory = new BoardFactory(sprites);
        GhostFactory ghostFactor = new GhostFactory(sprites);
        MapParser mapParser = new GhostMapParser(levelFactory, boardFactory, ghostFactor);
        List<String> text = Lists.newArrayList(
            "##############",
            "#.#....P..C...",
            "##############"
        );
        Level level = mapParser.parseMap(text);
        Clyde clyde = Navigation.findUnitInBoard(Clyde.class,level.getBoard());
        Player player = new PlayerFactory(new PacManSprites()).createPacMan();
        player.setDirection(Direction.WEST);
        level.registerPlayer(player);
        Optional<Direction> opt = clyde.nextAiMove();
        assertThat(opt.get()).isEqualTo(Direction.valueOf("EAST"));
    }

    @Test
    @DisplayName("Clybe离Player距离小于8个方块")
    @Order(4)
    public void departLessThanEight4(){
        PacManSprites sprites =new PacManSprites();
        LevelFactory levelFactory =new LevelFactory(
            sprites,
            new GhostFactory(sprites),
            mock(PointCalculator.class));
        BoardFactory boardFactory = new BoardFactory(sprites);
        GhostFactory ghostFactor = new GhostFactory(sprites);
        MapParser mapParser = new GhostMapParser(levelFactory, boardFactory, ghostFactor);
        List<String> text = Lists.newArrayList(
            "###P....######",
            "###C..........",
            "###...########"
        );
        Level level = mapParser.parseMap(text);
        Clyde clyde = Navigation.findUnitInBoard(Clyde.class,level.getBoard());
        Player player = new PlayerFactory(new PacManSprites()).createPacMan();
        player.setDirection(Direction.EAST);
        level.registerPlayer(player);
        Optional<Direction> opt = clyde.nextAiMove();
        assertThat(opt.get()).isEqualTo(Direction.valueOf("SOUTH"));
    }

    @Test
    @DisplayName("Clybe离Player距离大于8个方块")
    @Order(5)
    public void departLessThanEight5(){
        PacManSprites sprites =new PacManSprites();
        LevelFactory levelFactory =new LevelFactory(
            sprites,
            new GhostFactory(sprites),
            mock(PointCalculator.class));
        BoardFactory boardFactory = new BoardFactory(sprites);
        GhostFactory ghostFactor = new GhostFactory(sprites);
        MapParser mapParser = new GhostMapParser(levelFactory, boardFactory, ghostFactor);
        List<String> text = Lists.newArrayList(
            ".C................",
            "#.....#......#..P.",
            "##################"
        );
        Level level = mapParser.parseMap(text);
        Clyde clyde = Navigation.findUnitInBoard(Clyde.class,level.getBoard());
        Player player = new PlayerFactory(new PacManSprites()).createPacMan();
        player.setDirection(Direction.WEST);
        level.registerPlayer(player);
        Optional<Direction> opt = clyde.nextAiMove();
        assertThat(opt.get()).isEqualTo(Direction.valueOf("EAST"));
    }





}

