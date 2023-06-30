import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-hashtags-item')
export class VistaListaHashtagsItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" id="vaadinHorizontalLayout" style="z-index: 11;">
 <vaadin-vertical-layout id="video" style="align-items: flex-end;"></vaadin-vertical-layout>
 <vaadin-vertical-layout id="datosHashtags" style="flex-grow: 1; flex-shrink: 0; align-items: flex-start; z-index: 12;">
  <vaadin-button theme="tertiary" id="nombreHashtags" style="z-index: 13;">
    NombreHashtags 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing-s" id="layoutVisualizaciones">
   <label id="numVisualizaciones">0</label>
   <label id="lableVisualizaciones" style="flex-grow: 1;">NumeroVisualizaciones</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
