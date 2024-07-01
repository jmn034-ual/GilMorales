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
<vaadin-horizontal-layout class="content" id="vaadinHorizontalLayout" style="z-index: 11; align-items: center; border-radius: 10px; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2); padding: var(--lumo-space-m); width: 100%; border-radius: 18px; border: 2px solid #F5F5F5; background-color: white;">
 <vaadin-vertical-layout id="video" style="align-items: center; align-self: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout id="datosHashtags" style="flex-grow: 0; flex-shrink: 0; z-index: 12; color: white; align-items: center; align-self: center; margin: var(--lumo-space-xs); padding: var(--lumo-space-s); padding-right: var(--lumo-space-m); justify-content: center;">
  <vaadin-button theme="tertiary" id="nombreHashtags" style="z-index: 13; flex-shrink: 0; align-self: center;">
    NombreHashtags 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing-xs" id="layoutVisualizaciones" style="align-self: center; color: black;">
   <label id="numVisualizaciones">0</label>
   <label id="lableVisualizaciones" style="flex-grow: 0; flex-shrink: 0;">Visualizaciones</label>
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
