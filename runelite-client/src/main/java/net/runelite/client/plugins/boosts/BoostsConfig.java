/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.boosts;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(
	keyName = "boosts",
	name = "Boosts Information",
	description = "Configuration for the Boosts plugin"
)
public interface BoostsConfig extends Config
{
	@ConfigItem(
		keyName = "enableSkill",
		name = "Enable Skill Boosts",
		description = "Configures whether or not to display skill boost information",
		position = 1
	)
	default boolean enableSkill()
	{
		return true;
	}

	@ConfigItem(
		keyName = "relativeBoost",
		name = "Use Relative Boosts",
		description = "Configures whether or not relative boost is used",
		position = 2
	)
	default boolean useRelativeBoost()
	{
		return false;
	}

	@ConfigItem(
		keyName = "displayIndicators",
		name = "Display as indicators",
		description = "Configures whether or not to display the boost as indicators",
		position = 3
	)
	default boolean displayIndicators()
	{
		return false;
	}

	@ConfigItem(
		keyName = "displayNextChange",
		name = "Display next change",
		description = "Configures whether or not to display when the next stat change will be",
		position = 4
	)
	default boolean displayNextChange()
	{
		return true;
	}
}
