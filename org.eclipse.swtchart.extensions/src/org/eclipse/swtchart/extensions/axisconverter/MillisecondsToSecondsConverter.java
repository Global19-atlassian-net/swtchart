/*******************************************************************************
 * Copyright (c) 2018, 2019 Lablicate GmbH.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtchart.extensions.axisconverter;

import org.eclipse.swtchart.extensions.core.AbstractAxisScaleConverter;
import org.eclipse.swtchart.extensions.core.IAxisScaleConverter;

public class MillisecondsToSecondsConverter extends AbstractAxisScaleConverter implements IAxisScaleConverter {

	private static final double SECOND_CORRELATION_FACTOR = 1000.0d;

	@Override
	public double convertToSecondaryUnit(double primaryValue) {

		return primaryValue / SECOND_CORRELATION_FACTOR;
	}

	@Override
	public double convertToPrimaryUnit(double secondaryValue) {

		return secondaryValue * SECOND_CORRELATION_FACTOR;
	}
}
