/**********************************************************************************************************************
 * This file is part of Scrupal, a Scalable Reactive Web Application Framework for Content Management                 *
 *                                                                                                                    *
 * Copyright (c) 2015, Reactific Software LLC. All Rights Reserved.                                                   *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     *
 * with the License. You may obtain a copy of the License at                                                          *
 *                                                                                                                    *
 *     http://www.apache.org/licenses/LICENSE-2.0                                                                     *
 *                                                                                                                    *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   *
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  *
 * the specific language governing permissions and limitations under the License.                                     *
 **********************************************************************************************************************/

package scrupal.sbt

import sbt._
import sbt.Keys._

/** Settings For CompileQuick Plugin
  *
  * Description of thing
  */
object CompileQuick extends PluginSettings {

  import com.etsy.sbt.CompileQuick.CompileQuickTasks._

  override def projectSettings : Seq[Setting[_]] =
    com.etsy.sbt.CompileQuick.compileQuickSettings  ++ Seq(
      packageQuickOutput := new File(baseDirectory.value, "libs")
    )
}
