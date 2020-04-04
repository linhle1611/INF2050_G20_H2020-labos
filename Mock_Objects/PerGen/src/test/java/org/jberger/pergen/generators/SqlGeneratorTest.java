/* Copyright 2011 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jberger.pergen.generators;

import org.jberger.pergen.domain.DataLayerSpecifications;
import org.jberger.pergen.domain.Entity;
import org.jberger.pergen.domain.Field;
import org.jberger.pergen.domain.FieldType;
import org.jberger.pergen.tests.mock.MockFileWriter;
import org.junit.jupiter.api.*;

import java.io.IOException;

public class SqlGeneratorTest {
    @Test
    public void testGenerateBuild() throws IOException {
        MockFileWriter fileWriter = new MockFileWriter();
        DataLayerSpecifications global = new DataLayerSpecifications();

        Field f1 = new Field("UnField",
                FieldType.Type.DATE, true);
        Field f2 = new Field("F3",
                FieldType.Type.INTEGER, true);
        Field f3 = new Field("UneAutreAffaire",
                FieldType.Type.STRING, true);

        Entity e1 = new Entity("Rain");
        Entity e2 = new Entity("Pluie");
        Entity e3 = new Entity("Neige");

        e1.addField(f1);
        e1.addField(f2);
        e1.addField(f3);
        e2.addField(f2);
        e2.addField(f1);
        e3.addField(f3);

        global.addEntity(e1);
        global.addEntity(e3);
        global.addEntity(e2);

        SQLGenerator.generateBuild(global,fileWriter);
        Assertions.assertEquals("CREATE TABLE RAIN (\n" +
                "  RAIN_ID INTEGER NOT NULL,\n" +
                "  UNFIELD DATE,\n" +
                "  UNEAUTREAFFAIRE VARCHAR(255),\n" +
                "  F3 INTEGER,\n" +
                "  CONSTRAINT PK_RAIN PRIMARY KEY (RAIN_ID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE NEIGE (\n" +
                "  NEIGE_ID INTEGER NOT NULL,\n" +
                "  UNEAUTREAFFAIRE VARCHAR(255),\n" +
                "  CONSTRAINT PK_NEIGE PRIMARY KEY (NEIGE_ID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE PLUIE (\n" +
                "  PLUIE_ID INTEGER NOT NULL,\n" +
                "  UNFIELD DATE,\n" +
                "  F3 INTEGER,\n" +
                "  CONSTRAINT PK_PLUIE PRIMARY KEY (PLUIE_ID)\n" +
                ");\n\n",fileWriter.getWrittenData());

    }

    @Test
    public void testBuildJunctionTableNameNaturalOrder() {
        Assertions.assertEquals(SQLGenerator.buildJunctionTableName("AUTHOR", "BOOK"), "AUTHOR_BOOK");
    }

    @Test
    public void testBuildJunctionTableNameReverseOrder() {
        Assertions.assertEquals(SQLGenerator.buildJunctionTableName("BOOK", "AUTHOR"), "AUTHOR_BOOK");
    }
}
