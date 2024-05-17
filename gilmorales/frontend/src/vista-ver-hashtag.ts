import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-hashtag')
export class VistaVerHashtag extends LitElement {
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
<vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout" style="width: 100%; height: 100%; overflow-y: auto; scrollbar-color: transparent transparent; align-items: center;">
 <vaadin-horizontal-layout id="layoutDatosHashtag" style="justify-content: center; align-self: center; flex-shrink: 0; margin-top: var(--lumo-space-xl);">
  <vaadin-vertical-layout id="imagenHashtag" style="flex-shrink: 0; align-self: center; align-items: center;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutInformacionHashtag">
   <h2 id="h2">#NombreHashtag</h2>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 0; width: 100%;">
    <label id="numVisualizaciones">0</label>
    <label id="labelNumVisualizaciones" style="flex-grow: 1;">Numero Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <hr style="width: 98%; align-self: center; flex-shrink: 0; height: 2px;">
 <vaadin-vertical-layout theme="spacing" id="layoutLista" style="flex-grow: 0; flex-shrink: 0; align-self: center; width: 100%; align-items: center; padding-bottom: 5%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
