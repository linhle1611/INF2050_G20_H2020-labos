/* Copyright 2007 Jacques Berger

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
package org.jberger.pergen.domain;

import org.junit.jupiter.api.*;

public class EntityTest {

    @Test
    public final void testGetOriginalName() {
        String entityName = "Rain";
        Entity entity = new Entity(entityName);
        Assertions.assertEquals(entityName, entity.getOriginalName());
    }

    @Test
    public final void testIsDefined() {
        Entity entity = new Entity("Rain");
        String fieldName = "field";
        Field field = new Field(fieldName,
                FieldType.Type.INTEGER, true);
        entity.addField(field);
        Assertions.assertTrue(entity.isFieldDefined(fieldName));
    }

    @Test
    public final void testGetField() {
        Entity entity = new Entity("Rain");
        String fieldName = "field";
        Field field = new Field(fieldName,
                FieldType.Type.INTEGER, true);

        entity.addField(field);
        Assertions.assertSame(field, entity.getField(fieldName));
    }

    @Test
    public final void testGetUndefinedField() {
        Entity entity = new Entity("Rain");
        Assertions.assertNull(entity.getField("broken"));
    }

    @Test
    public final void testSqlName() {
        Entity entity = new Entity("entity_name");
        Assertions.assertEquals("ENTITY_NAME", entity.getSqlName());
    }

    @Test
    public final void testJavaName() {
        Entity entity = new Entity("entity_name");
        Assertions.assertEquals("EntityName", entity.getJavaName());
    }
}
