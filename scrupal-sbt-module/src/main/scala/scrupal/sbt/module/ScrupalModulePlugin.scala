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

package scrupal.sbt.module

import play.sbt.PlayScala

import sbt.Keys._
import sbt._

import scrupal.sbt.project.ScrupalProjectPluginTrait

/** The ScrupalPlugin For Scrupal Based Modules */
object ScrupalModulePlugin extends ScrupalProjectPluginTrait {

  override def autoplugins : Seq[AutoPlugin] = super.autoplugins ++ Seq( PlayScala )

  /**
   * Define the values of the settings
   */
  override def projectSettings: Seq[Setting[_]] = {
    super.projectSettings ++ Seq (
      libraryDependencies ++= Seq(
        "com.typesafe.play" %% "play-specs2" % "2.4.2" % "test",
        "com.typesafe.play" %% "play-test" % "2.4.2" % "test",
        "org.specs2" %% "specs2-core" % "3.6.1" % "test",
        "org.specs2" %% "specs2-junit" % "3.6.1" % "test"
      )
    )
  }
}





















